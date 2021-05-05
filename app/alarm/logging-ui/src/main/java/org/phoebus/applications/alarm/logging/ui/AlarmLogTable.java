package org.phoebus.applications.alarm.logging.ui;

import java.io.IOException;
import java.net.URI;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.phoebus.framework.spi.AppDescriptor;
import org.phoebus.framework.spi.AppInstance;
import org.phoebus.ui.docking.DockItem;
import org.phoebus.ui.docking.DockPane;
import org.elasticsearch.client.RestHighLevelClient;

import javafx.fxml.FXMLLoader;

public class AlarmLogTable implements AppInstance {

    private final AlarmLogTableApp app;
    private DockItem tab;
    private AlarmLogTableController controller;

    AlarmLogTable(final AlarmLogTableApp app) {
        this.app = app;
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(this.getClass().getResource("AlarmLogTable.fxml"));
            loader.setControllerFactory(clazz -> {
                try {
                    if(clazz.isAssignableFrom(AlarmLogTableController.class)){
                        return clazz.getConstructor(RestHighLevelClient.class)
                                .newInstance(app.getClient());
                    }
                    else if(clazz.isAssignableFrom(AdvancedSearchViewController.class)){
                        return clazz.getConstructor(RestHighLevelClient.class)
                                .newInstance(app.getClient());
                    }
                } catch (Exception e) {
                    Logger.getLogger(AlarmLogTable.class.getName()).log(Level.SEVERE, "Failed to construct controller for Alarm Log Table View", e);
                }
                return null;
            });
            tab = new DockItem(this, loader.load());
            controller = loader.getController();
            tab.setOnClosed(event -> {
                controller.shutdown();
            });
            DockPane.getActiveDockPane().addTab(tab);
        } catch (IOException e) {
            Logger.getLogger(getClass().getName()).log(Level.WARNING, "Cannot load UI", e);
        }
    }

    @Override
    public AppDescriptor getAppDescriptor() {
        return app;
    }
    

    public void setPVResource(URI resource) {
        String query = resource.getQuery();
        // TODO URI parsing might be improved.
        String parsedQuery = Arrays.asList(query.split("&")).stream().filter(s->{
            return s.startsWith("pv");
        }).map(s->{return s.split("=")[1];}).collect(Collectors.joining(" "));

        controller.setSearchString(parsedQuery);
        controller.setIsNodeTable(false);
    }
    
    public void setNodeResource(URI resource) {
        String query = resource.getQuery();
        // TODO URI parsing might be improved.
        String parsedQuery = Arrays.asList(query.split("&")).stream().filter(s->{
            return s.startsWith("node");
        }).map(s->{return s.split("=")[1];}).collect(Collectors.joining(" "));

        controller.setSearchString(parsedQuery);
        controller.setIsNodeTable(true);
    }
}

/*******************************************************************************
 * Copyright (c) 2015-2021 Oak Ridge National Laboratory.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.csstudio.display.builder.model;

import org.phoebus.framework.nls.NLS;

/** Externalized Strings
 *  @author Kay Kasemir
 */
public class Messages
{
    /** Externalized strings */
    public static String ActionExecuteCommand,
                         ActionExecuteScript,
                         ActionOpenDisplay,
                         ActionOpenFile,
                         ActionOpenWebPage,
                         ActionWritePV,
                         Actions_N_Fmt,
                         ActiveTab,
                         ArrayWidget_Description,
                         ArrayWidget_Name,
                         ArrowLength,
                         Arrows,
                         Arrows_None,
                         Arrows_From,
                         Arrows_To,
                         Arrows_Both,
                         AutoSize,
                         BoolWidget_Mode,
                         BoolWidget_OffLabel,
                         BoolWidget_OnLabel,
                         BoolWidget_Push,
                         BoolWidget_PushInverted,
                         BoolWidget_Toggle,
                         ByteMonitor_BitReverse,
                         ByteMonitor_NumBits,
                         ByteMonitor_StartBit,
                         Bottom,
                         Checkbox_Label,
                         Center,
                         ComboWidget_Item,
                         ComboWidget_Items,
                         Confirm_NONE,
                         Confirm_BOTH,
                         Confirm_PUSH,
                         Confirm_RELEASE,
                         EmbeddedDisplayWidget_GroupName,
                         FontStyle_Bold,
                         FontStyle_BoldItalic,
                         FontStyle_Italic,
                         FontStyle_Regular,
                         GroupWidget_Description,
                         GroupWidget_Name,
                         Interpolation_Automatic,
                         Interpolation_Interpolate,
                         Interpolation_None,
                         LabelWidget_Text,
                         Left,
                         LineStyle,
                         LineStyle_Solid,
                         LineStyle_Dash,
                         LineStyle_DashDot,
                         LineStyle_DashDotDot,
                         LineStyle_Dot,
                         Middle,
                         PlotWidget_AutoScale,
                         PlotWidget_Color,
                         PlotWidget_ErrorPV,
                         PlotWidget_GridColor,
                         PlotWidget_LogScale,
                         PlotWidget_PointSize,
                         PlotWidget_PointType,
                         PlotWidget_ScaleFont,
                         PlotWidget_SelectionValuePV,
                         PlotWidget_ShowGrid,
                         PlotWidget_ShowLegend,
                         PlotWidget_ShowToolbar,
                         PlotWidget_Title,
                         PlotWidget_TitleFont,
                         PlotWidget_Trace,
                         PlotWidget_Traces,
                         PlotWidget_TraceType,
                         PlotWidget_X,
                         PlotWidget_XAxis,
                         PlotWidget_XPV,
                         PlotWidget_Y,
                         PlotWidget_YAxes,
                         PlotWidget_YAxis,
                         PlotWidget_YPV,
                         PointType_Circles,
                         PointType_Diamonds,
                         PointType_None,
                         PointType_Squares,
                         PointType_Triangles,
                         PointType_X,
                         Resize_Container,
                         Resize_Content,
                         Resize_Crop,
                         Resize_None,
                         Resize_Stretch,
                         Right,
                         Rotation_0,
                         Rotation_180,
                         Rotation_270,
                         Rotation_90,
                         ScrollBar_ShowValueTip,
                         ScrollBar_BarLength,
                         SlideButton_Label,
                         Spinner_ButtonsOnLeft,
                         Stripchart_Description,
                         Stripchart_LabelFont,
                         Stripchart_Name,
                         Stripchart_StartTime,
                         Stripchart_EndTime,
                         Style,
                         Style_Group,
                         Style_Line,
                         Style_None,
                         Style_Title,
                         Tab_Height,
                         Tab_Item,
                         TabsWidget_Description,
                         TabsWidget_Name,
                         TabsWidget_TabNameFmt,
                         Target_Replace,
                         Target_Standalone,
                         Target_Tab,
                         Target_Window,
                         Top,
                         TraceType_Bars,
                         TraceType_Errorbar,
                         TraceType_Line,
                         TraceType_LineErrorbar,
                         TraceType_None,
                         TraceType_Step,
                         ValueNoPV,
                         Vertical,
                         WebBrowser_showToolbar,
                         WebBrowser_URL,
                         WidgetCategory_Controls,
                         WidgetCategory_Extensions,
                         WidgetCategory_Graphics,
                         WidgetCategory_Miscellaneous,
                         WidgetCategory_Monitors,
                         WidgetCategory_Plots,
                         WidgetCategory_Structure,
                         WidgetProperties_Actions,
                         WidgetProperties_AngleSize,
                         WidgetProperties_AngleStart,
                         WidgetProperties_ArrayIndex,
                         WidgetProperties_AutoScale,
                         WidgetProperties_AutoSize,
                         WidgetProperties_Average,
                         WidgetProperties_AverageColor,
                         WidgetProperties_AverageSamples,
                         WidgetProperties_BackgroundColor,
                         WidgetProperties_BarBackgroundColor,
                         WidgetProperties_BarColor,
                         WidgetProperties_Bit,
                         WidgetProperties_BorderAlarmSensitive,
                         WidgetProperties_BorderColor,
                         WidgetProperties_BorderWidth,
                         WidgetProperties_CellColors,
                         WidgetProperties_Class,
                         WidgetProperties_ColorHiHi,
                         WidgetProperties_ColorHigh,
                         WidgetProperties_ColorLoLo,
                         WidgetProperties_ColorLow,
                         WidgetProperties_ColorMap,
                         WidgetProperties_ColorMode,
                         WidgetProperties_ColorOK,
                         WidgetProperties_ConfirmDialog,
                         WidgetProperties_ConfirmMessage,
                         WidgetProperties_Connected,
                         WidgetProperties_CornerHeight,
                         WidgetProperties_CornerWidth,
                         WidgetProperties_CursorCrosshair,
                         WidgetProperties_CursorInfo,
                         WidgetProperties_CursorInfoPV,
                         WidgetProperties_CursorXPV,
                         WidgetProperties_CursorYPV,
                         WidgetProperties_DataHeight,
                         WidgetProperties_DataWidth,
                         WidgetProperties_DateColor,
                         WidgetProperties_DateVisible,
                         WidgetProperties_Direction,
                         WidgetProperties_DisconnectOverlayColor,
                         WidgetProperties_DiscreteHours,
                         WidgetProperties_DiscreteMinutes,
                         WidgetProperties_DiscreteSeconds,
                         WidgetProperties_DragDisabled,
                         WidgetProperties_Editable,
                         WidgetProperties_EmptyColor,
                         WidgetProperties_Enabled,
                         WidgetProperties_ExtremaVisible,
                         WidgetProperties_FallbackSymbol,
                         WidgetProperties_File,
                         WidgetProperties_Filecomponent,
                         WidgetProperties_FillColor,
                         WidgetProperties_FlatBar,
                         WidgetProperties_Font,
                         WidgetProperties_ForegroundColor,
                         WidgetProperties_Format,
                         WidgetProperties_Gap,
                         WidgetProperties_GridColor,
                         WidgetProperties_GridStepX,
                         WidgetProperties_GridStepY,
                         WidgetProperties_GridVisible,
                         WidgetProperties_Height,
                         WidgetProperties_HeightPVName,
                         WidgetProperties_HighlightBar,
                         WidgetProperties_HighlightZones,
                         WidgetProperties_Horizontal,
                         WidgetProperties_HorizontalAlignment,
                         WidgetProperties_HourColor,
                         WidgetProperties_HourTickMarkColor,
                         WidgetProperties_HourTickMarkVisible,
                         WidgetProperties_Increment,
                         WidgetProperties_InitialIndex,
                         WidgetProperties_Insets,
                         WidgetProperties_Interactive,
                         WidgetProperties_Interpolation,
                         WidgetProperties_ItemsFromPV,
                         WidgetProperties_KnobColor,
                         WidgetProperties_KnobPosition,
                         WidgetProperties_LabelsFromPV,
                         WidgetProperties_LcdCrystalEnabled,
                         WidgetProperties_LcdDesign,
                         WidgetProperties_LcdFont,
                         WidgetProperties_LcdVisible,
                         WidgetProperties_LevelHigh,
                         WidgetProperties_LevelHiHi,
                         WidgetProperties_LevelLow,
                         WidgetProperties_LevelLoLo,
                         WidgetProperties_LimitsFromPV,
                         WidgetProperties_LineColor,
                         WidgetProperties_LineWidth,
                         WidgetProperties_Locale,
                         WidgetProperties_Macros,
                         WidgetProperties_MajorTickSpace,
                         WidgetProperties_MajorTickStepHint,
                         WidgetProperties_MajorTickVisible,
                         WidgetProperties_Maximum,
                         WidgetProperties_MediumTickVisible,
                         WidgetProperties_Minimum,
                         WidgetProperties_MinorTickSpace,
                         WidgetProperties_MinorTickVisible,
                         WidgetProperties_MinuteColor,
                         WidgetProperties_MinuteTickMarkColor,
                         WidgetProperties_MinuteTickMarkVisible,
                         WidgetProperties_MultiLine,
                         WidgetProperties_Name,
                         WidgetProperties_NeedleColor,
                         WidgetProperties_OffColor,
                         WidgetProperties_OffImage,
                         WidgetProperties_OffLabel,
                         WidgetProperties_OnColor,
                         WidgetProperties_OnImage,
                         WidgetProperties_OnLabel,
                         WidgetProperties_OnlyExtremaVisible,
                         WidgetProperties_Opacity,
                         WidgetProperties_Orientation,
                         WidgetProperties_Password,
                         WidgetProperties_Points,
                         WidgetProperties_Precision,
                         WidgetProperties_PreserveRatio,
                         WidgetProperties_PVName,
                         WidgetProperties_ReadbackPVName,
                         WidgetProperties_ReadbackPVValue,
                         WidgetProperties_ResizeBehavior,
                         WidgetProperties_RingColor,
                         WidgetProperties_RingWidth,
                         WidgetProperties_Rotation,
                         WidgetProperties_Rules,
                         WidgetProperties_Running,
                         WidgetProperties_ScaleFactor,
                         WidgetProperties_ScaleFormat,
                         WidgetProperties_ScaleDirection,
                         WidgetProperties_ScaleVisible,
                         WidgetProperties_SecondColor,
                         WidgetProperties_SecondVisible,
                         WidgetProperties_Scripts,
                         WidgetProperties_Selection,
                         WidgetProperties_SelectionPV,
                         WidgetProperties_ShadowsEnabled,
                         WidgetProperties_ShowHigh,
                         WidgetProperties_ShowHiHi,
                         WidgetProperties_ShowIndex,
                         WidgetProperties_ShowLED,
                         WidgetProperties_ShowLimits,
                         WidgetProperties_ShowLow,
                         WidgetProperties_ShowLoLo,
                         WidgetProperties_ShowMinorTicks,
                         WidgetProperties_ShowOK,
                         WidgetProperties_ShowScale,
                         WidgetProperties_ShowUnits,
                         WidgetProperties_ShowValue,
                         WidgetProperties_Skin,
                         WidgetProperties_Square,
                         WidgetProperties_StartFromZero,
                         WidgetProperties_StretchToFit,
                         WidgetProperties_Symbol,
                         WidgetProperties_Symbols,
                         WidgetProperties_SymbolValue,
                         WidgetProperties_SyncedKnob,
                         WidgetProperties_TagColor,
                         WidgetProperties_TagVisible,
                         WidgetProperties_TargetVisible,
                         WidgetProperties_Text,
                         WidgetProperties_TextColor,
                         WidgetProperties_TextVisible,
                         WidgetProperties_ThumbColor,
                         WidgetProperties_TickLabelColor,
                         WidgetProperties_TickLabelDecimals,
                         WidgetProperties_TickLabelsVisible,
                         WidgetProperties_TickMarkRingVisible,
                         WidgetProperties_Title,
                         WidgetProperties_TitleColor,
                         WidgetProperties_TitleVisible,
                         WidgetProperties_Tooltip,
                         WidgetProperties_Transparent,
                         WidgetProperties_Type,
                         WidgetProperties_Unit,
                         WidgetProperties_UnitFromPV,
                         WidgetProperties_UnsignedData,
                         WidgetProperties_Value,
                         WidgetProperties_ValueColor,
                         WidgetProperties_ValueVisible,
                         WidgetProperties_VerticalAlignment,
                         WidgetProperties_Visible,
                         WidgetProperties_Width,
                         WidgetProperties_WidthPVName,
                         WidgetProperties_WrapCount,
                         WidgetProperties_WrapWords,
                         WidgetProperties_Writable,
                         WidgetProperties_WriteOnRelease,
                         WidgetProperties_X,
                         WidgetProperties_XPVName,
                         WidgetProperties_Y,
                         WidgetProperties_YPVName,
                         WidgetProperties_ZeroDetentEnabled,
                         WidgetPropertyCategory_Behavior,
                         WidgetPropertyCategory_Display,
                         WidgetPropertyCategory_Misc,
                         WidgetPropertyCategory_Position,
                         WidgetPropertyCategory_Runtime,
                         WidgetPropertyCategory_Widget,
                         XYPlot_Description,
                         XYPlot_Name;

    static
    {
        NLS.initializeMessages(Messages.class);
    }

    private Messages()
    {
    }
}

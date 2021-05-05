/*******************************************************************************
 * Copyright (c) 2015-2020 Oak Ridge National Laboratory.
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
    public static String ActionExecuteCommand;
    public static String ActionExecuteScript;
    public static String ActionOpenDisplay;
    public static String ActionOpenFile;
    public static String ActionOpenWebPage;
    public static String ActionWritePV;
    public static String Actions_N_Fmt;
    public static String ActiveTab;
    public static String ArrayWidget_Description;
    public static String ArrayWidget_Name;
    public static String ArrowLength;
    public static String Arrows;
    public static String Arrows_None;
    public static String Arrows_From;
    public static String Arrows_To;
    public static String Arrows_Both;
    public static String AutoSize;
    public static String BoolWidget_Mode;
    public static String BoolWidget_OffLabel;
    public static String BoolWidget_OnLabel;
    public static String BoolWidget_Push;
    public static String BoolWidget_PushInverted;
    public static String BoolWidget_Toggle;
    public static String ByteMonitor_BitReverse;
    public static String ByteMonitor_NumBits;
    public static String ByteMonitor_StartBit;
    public static String Bottom;
    public static String Checkbox_Label;
    public static String Center;
    public static String ComboWidget_Item;
    public static String ComboWidget_Items;
    public static String Confirm_NONE;
    public static String Confirm_BOTH;
    public static String Confirm_PUSH;
    public static String Confirm_RELEASE;
    public static String EmbeddedDisplayWidget_GroupName;
    public static String FontStyle_Bold;
    public static String FontStyle_BoldItalic;
    public static String FontStyle_Italic;
    public static String FontStyle_Regular;
    public static String GroupWidget_Description;
    public static String GroupWidget_Name;
    public static String Interpolation_Automatic;
    public static String Interpolation_Interpolate;
    public static String Interpolation_None;
    public static String LabelWidget_Text;
    public static String Left;
    public static String LineStyle;
    public static String LineStyle_Solid;
    public static String LineStyle_Dash;
    public static String LineStyle_DashDot;
    public static String LineStyle_DashDotDot;
    public static String LineStyle_Dot;
    public static String Middle;
    public static String PlotWidget_AutoScale;
    public static String PlotWidget_Color;
    public static String PlotWidget_ErrorPV;
    public static String PlotWidget_GridColor;
    public static String PlotWidget_LogScale;
    public static String PlotWidget_PointSize;
    public static String PlotWidget_PointType;
    public static String PlotWidget_ScaleFont;
    public static String PlotWidget_SelectionValuePV;
    public static String PlotWidget_ShowGrid;
    public static String PlotWidget_ShowLegend;
    public static String PlotWidget_ShowToolbar;
    public static String PlotWidget_Title;
    public static String PlotWidget_TitleFont;
    public static String PlotWidget_Trace;
    public static String PlotWidget_Traces;
    public static String PlotWidget_TraceType;
    public static String PlotWidget_X;
    public static String PlotWidget_XAxis;
    public static String PlotWidget_XPV;
    public static String PlotWidget_Y;
    public static String PlotWidget_YAxes;
    public static String PlotWidget_YAxis;
    public static String PlotWidget_YPV;
    public static String PointType_Circles;
    public static String PointType_Diamonds;
    public static String PointType_None;
    public static String PointType_Squares;
    public static String PointType_Triangles;
    public static String PointType_X;
    public static String Resize_Container;
    public static String Resize_Content;
    public static String Resize_Crop;
    public static String Resize_None;
    public static String Resize_Stretch;
    public static String Right;
    public static String Rotation_0;
    public static String Rotation_180;
    public static String Rotation_270;
    public static String Rotation_90;
    public static String ScrollBar_ShowValueTip;
    public static String ScrollBar_BarLength;
    public static String SlideButton_Label;
    public static String Spinner_ButtonsOnLeft;
    public static String Stripchart_Description;
    public static String Stripchart_LabelFont;
    public static String Stripchart_Name;
    public static String Stripchart_TimeRange;
    public static String Style;
    public static String Style_Group;
    public static String Style_Line;
    public static String Style_None;
    public static String Style_Title;
    public static String Tab_Height;
    public static String Tab_Item;
    public static String TabsWidget_Description;
    public static String TabsWidget_Name;
    public static String TabsWidget_TabNameFmt;
    public static String Target_Replace;
    public static String Target_Standalone;
    public static String Target_Tab;
    public static String Target_Window;
    public static String Top;
    public static String TraceType_Bars;
    public static String TraceType_Errorbar;
    public static String TraceType_Line;
    public static String TraceType_LineErrorbar;
    public static String TraceType_None;
    public static String TraceType_Step;
    public static String ValueNoPV;
    public static String Vertical;
    public static String WebBrowser_showToolbar;
    public static String WebBrowser_URL;
    public static String WidgetCategory_Controls;
    public static String WidgetCategory_Extensions;
    public static String WidgetCategory_Graphics;
    public static String WidgetCategory_Miscellaneous;
    public static String WidgetCategory_Monitors;
    public static String WidgetCategory_Plots;
    public static String WidgetCategory_Structure;
    public static String WidgetProperties_Actions;
    public static String WidgetProperties_AngleSize;
    public static String WidgetProperties_AngleStart;
    public static String WidgetProperties_ArrayIndex;
    public static String WidgetProperties_AutoScale;
    public static String WidgetProperties_AutoSize;
    public static String WidgetProperties_Average;
    public static String WidgetProperties_AverageColor;
    public static String WidgetProperties_AverageSamples;
    public static String WidgetProperties_BackgroundColor;
    public static String WidgetProperties_BarBackgroundColor;
    public static String WidgetProperties_BarColor;
    public static String WidgetProperties_Bit;
    public static String WidgetProperties_BorderAlarmSensitive;
    public static String WidgetProperties_BorderColor;
    public static String WidgetProperties_BorderWidth;
    public static String WidgetProperties_CellColors;
    public static String WidgetProperties_Class;
    public static String WidgetProperties_ColorHiHi;
    public static String WidgetProperties_ColorHigh;
    public static String WidgetProperties_ColorLoLo;
    public static String WidgetProperties_ColorLow;
    public static String WidgetProperties_ColorMap;
    public static String WidgetProperties_ColorMode;
    public static String WidgetProperties_ColorOK;
    public static String WidgetProperties_ConfirmDialog;
    public static String WidgetProperties_ConfirmMessage;
    public static String WidgetProperties_Connected;
    public static String WidgetProperties_CornerHeight;
    public static String WidgetProperties_CornerWidth;
    public static String WidgetProperties_CursorCrosshair;
    public static String WidgetProperties_CursorInfo;
    public static String WidgetProperties_CursorInfoPV;
    public static String WidgetProperties_CursorXPV;
    public static String WidgetProperties_CursorYPV;
    public static String WidgetProperties_DataHeight;
    public static String WidgetProperties_DataWidth;
    public static String WidgetProperties_DateColor;
    public static String WidgetProperties_DateVisible;
    public static String WidgetProperties_Direction;
    public static String WidgetProperties_DiscreteHours;
    public static String WidgetProperties_DiscreteMinutes;
    public static String WidgetProperties_DiscreteSeconds;
    public static String WidgetProperties_DragDisabled;
    public static String WidgetProperties_Editable;
    public static String WidgetProperties_EmptyColor;
    public static String WidgetProperties_Enabled;
    public static String WidgetProperties_ExtremaVisible;
    public static String WidgetProperties_File;
    public static String WidgetProperties_Filecomponent;
    public static String WidgetProperties_FillColor;
    public static String WidgetProperties_FlatBar;
    public static String WidgetProperties_Font;
    public static String WidgetProperties_ForegroundColor;
    public static String WidgetProperties_Format;
    public static String WidgetProperties_GridColor;
    public static String WidgetProperties_GridStepX;
    public static String WidgetProperties_GridStepY;
    public static String WidgetProperties_GridVisible;
    public static String WidgetProperties_Height;
    public static String WidgetProperties_HeightPVName;
    public static String WidgetProperties_HighlightBar;
    public static String WidgetProperties_HighlightZones;
    public static String WidgetProperties_Horizontal;
    public static String WidgetProperties_HorizontalAlignment;
    public static String WidgetProperties_HourColor;
    public static String WidgetProperties_HourTickMarkColor;
    public static String WidgetProperties_HourTickMarkVisible;
    public static String WidgetProperties_Increment;
    public static String WidgetProperties_InitialIndex;
    public static String WidgetProperties_Insets;
    public static String WidgetProperties_Interactive;
    public static String WidgetProperties_Interpolation;
    public static String WidgetProperties_ItemsFromPV;
    public static String WidgetProperties_KnobColor;
    public static String WidgetProperties_KnobPosition;
    public static String WidgetProperties_LabelsFromPV;
    public static String WidgetProperties_LcdCrystalEnabled;
    public static String WidgetProperties_LcdDesign;
    public static String WidgetProperties_LcdFont;
    public static String WidgetProperties_LcdVisible;
    public static String WidgetProperties_LevelHigh;
    public static String WidgetProperties_LevelHiHi;
    public static String WidgetProperties_LevelLow;
    public static String WidgetProperties_LevelLoLo;
    public static String WidgetProperties_LimitsFromPV;
    public static String WidgetProperties_LineColor;
    public static String WidgetProperties_LineWidth;
    public static String WidgetProperties_Locale;
    public static String WidgetProperties_Macros;
    public static String WidgetProperties_MajorTickSpace;
    public static String WidgetProperties_MajorTickStepHint;
    public static String WidgetProperties_MajorTickVisible;
    public static String WidgetProperties_Maximum;
    public static String WidgetProperties_MediumTickVisible;
    public static String WidgetProperties_Minimum;
    public static String WidgetProperties_MinorTickSpace;
    public static String WidgetProperties_MinorTickVisible;
    public static String WidgetProperties_MinuteColor;
    public static String WidgetProperties_MinuteTickMarkColor;
    public static String WidgetProperties_MinuteTickMarkVisible;
    public static String WidgetProperties_MultiLine;
    public static String WidgetProperties_Name;
    public static String WidgetProperties_NeedleColor;
    public static String WidgetProperties_OffColor;
    public static String WidgetProperties_OffImage;
    public static String WidgetProperties_OffLabel;
    public static String WidgetProperties_OnColor;
    public static String WidgetProperties_OnImage;
    public static String WidgetProperties_OnLabel;
    public static String WidgetProperties_OnlyExtremaVisible;
    public static String WidgetProperties_Opacity;
    public static String WidgetProperties_Orientation;
    public static String WidgetProperties_Password;
    public static String WidgetProperties_Points;
    public static String WidgetProperties_Precision;
    public static String WidgetProperties_PreserveRatio;
    public static String WidgetProperties_PVName;
    public static String WidgetProperties_ReadbackPVName;
    public static String WidgetProperties_ReadbackPVValue;
    public static String WidgetProperties_ResizeBehavior;
    public static String WidgetProperties_RingColor;
    public static String WidgetProperties_RingWidth;
    public static String WidgetProperties_Rotation;
    public static String WidgetProperties_Rules;
    public static String WidgetProperties_Running;
    public static String WidgetProperties_ScaleFactor;
    public static String WidgetProperties_ScaleFormat;
    public static String WidgetProperties_ScaleDirection;
    public static String WidgetProperties_ScaleVisible;
    public static String WidgetProperties_SecondColor;
    public static String WidgetProperties_SecondVisible;
    public static String WidgetProperties_Scripts;
    public static String WidgetProperties_Selection;
    public static String WidgetProperties_SelectionPV;
    public static String WidgetProperties_ShadowsEnabled;
    public static String WidgetProperties_ShowHigh;
    public static String WidgetProperties_ShowHiHi;
    public static String WidgetProperties_ShowIndex;
    public static String WidgetProperties_ShowLED;
    public static String WidgetProperties_ShowLimits;
    public static String WidgetProperties_ShowLow;
    public static String WidgetProperties_ShowLoLo;
    public static String WidgetProperties_ShowMinorTicks;
    public static String WidgetProperties_ShowOK;
    public static String WidgetProperties_ShowScale;
    public static String WidgetProperties_ShowUnits;
    public static String WidgetProperties_ShowValue;
    public static String WidgetProperties_Skin;
    public static String WidgetProperties_Square;
    public static String WidgetProperties_StartFromZero;
    public static String WidgetProperties_StretchToFit;
    public static String WidgetProperties_Symbol;
    public static String WidgetProperties_Symbols;
    public static String WidgetProperties_SymbolValue;
    public static String WidgetProperties_SyncedKnob;
    public static String WidgetProperties_TagColor;
    public static String WidgetProperties_TagVisible;
    public static String WidgetProperties_TargetVisible;
    public static String WidgetProperties_Text;
    public static String WidgetProperties_TextColor;
    public static String WidgetProperties_TextVisible;
    public static String WidgetProperties_ThumbColor;
    public static String WidgetProperties_TickLabelColor;
    public static String WidgetProperties_TickLabelDecimals;
    public static String WidgetProperties_TickLabelsVisible;
    public static String WidgetProperties_TickMarkRingVisible;
    public static String WidgetProperties_Title;
    public static String WidgetProperties_TitleColor;
    public static String WidgetProperties_TitleVisible;
    public static String WidgetProperties_Tooltip;
    public static String WidgetProperties_Transparent;
    public static String WidgetProperties_Type;
    public static String WidgetProperties_Unit;
    public static String WidgetProperties_UnitFromPV;
    public static String WidgetProperties_UnsignedData;
    public static String WidgetProperties_Value;
    public static String WidgetProperties_ValueColor;
    public static String WidgetProperties_ValueVisible;
    public static String WidgetProperties_VerticalAlignment;
    public static String WidgetProperties_Visible;
    public static String WidgetProperties_Width;
    public static String WidgetProperties_WidthPVName;
    public static String WidgetProperties_WrapWords;
    public static String WidgetProperties_Writable;
    public static String WidgetProperties_WriteOnRelease;
    public static String WidgetProperties_X;
    public static String WidgetProperties_XPVName;
    public static String WidgetProperties_Y;
    public static String WidgetProperties_YPVName;
    public static String WidgetProperties_ZeroDetentEnabled;
    public static String WidgetPropertyCategory_Behavior;
    public static String WidgetPropertyCategory_Display;
    public static String WidgetPropertyCategory_Misc;
    public static String WidgetPropertyCategory_Position;
    public static String WidgetPropertyCategory_Runtime;
    public static String WidgetPropertyCategory_Widget;
    public static String XYPlot_Description;
    public static String XYPlot_Name;

    static
    {
        NLS.initializeMessages(Messages.class);
    }

    private Messages()
    {
    }
}

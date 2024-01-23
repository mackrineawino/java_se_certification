package com.maks.strings.tools;

public class ReportTool extends Tool implements Exportable{
    public void export(){
        System.out.println("Rtool::Export");

    }

    public static void main(String[] args) {
        Tool atool=new ReportTool();
        Tool btool =new Tool();
        callExport(atool);
        callExport(btool);
    }

    public static void callExport(Exportable ex){
        ex.export();
    }
}

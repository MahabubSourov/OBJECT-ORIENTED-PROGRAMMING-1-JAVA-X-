import java.util.ArrayList;

public class TrainInfo {
    private final ArrayList<Train> trainInfo = new ArrayList<>(){{
        add(new Train("DHAKA", "CHILAHATI", "CHILAHATI EXPRESS", "22671", "06:00 to 11:03", 0.00, 980.00));
        add(new Train("DHAKA", "KHULNA", "KHULNA EXPRESS", "16101", "17:00 to 23:02", 265.00, 720.00));
        add(new Train("DHAKA", "RANGPUR", "RANGPUR EXPRESS", "12637", "21:40 to 03:52", 295.00, 765.00));
        add(new Train("CHILAHATI", "DHAKA", "NILSHAGOR EXPRESS", "12635", "13:50 to 20:05", 0.00, 180.00));
        add(new Train("DHAKA", "CUMILLA", "CUMILLA EXPRESS", "12661", "20:40 to 02:57", 295.00, 765.00));
        add(new Train("RANGPUR", "DHAKA", "SIMANTO EXPRESS", "16127", "09:45 to 16:25", 0.00, 165.00));
        add(new Train("CUMILLA", "DHAKA", "TITAS EXPRESS", "22672", "15:47 to 21:15", 0.00, 1140.00));
        add(new Train("KHULNA", "DHAKA", "SIMBALA EXPRESS", "12636", "07:35 to 14:10", 0.00, 180.00));
        add(new Train("CHILAHATI", "RANGPUR", "PANDIAN EXP", "12638", "22:20 to 05:10", 295.00, 765.00));
        add(new Train("RANGPUR", "CHILAHATI", "ABC EXPRESS", "16102", "20:00 to 03:05", 265.00, 720.00));
        add(new Train("KHULNA", "RANGPUR", "POTHIGAI EXPRESS", "12662", "22:35 to 05:40", 295.00, 765.00));
        add(new Train("RANGPUR", "KHULNA", "GUV EXPRESS", "16128", "13:20 to 20:35", 165.00, 265.00));
        add(new Train("RANGPUR", "CUMILLA", "PGT EXPRESS", "22652", "19:40 to 04:05", 325.00, 190.00));
        add(new Train("CUMILLA", "RANGPUR", "MAS EXPRESS", "22651", "21:40 to 06:00", 325.00, 190.00));
        add(new Train("CUMILLA", "KHULNA", "MAS EXPRESS", "20601", "22:30 to 05:57", 325.00, 835.00));
    }};

    public ArrayList<Train> getTrainInfo(){
        return trainInfo;
    }
}

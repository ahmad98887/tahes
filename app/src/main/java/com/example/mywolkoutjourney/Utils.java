package com.example.mywolkoutjourney;

import android.util.Log;

import java.util.ArrayList;

public class Utils {
    private static ArrayList<LatihanModel> allTrainings;
    private static ArrayList<JadwalModel> usersPlan;

    public Utils(){
        if(null==allTrainings)
            allTrainings = new ArrayList<>();
        if(null==usersPlan)
            usersPlan = new ArrayList<>();
        LatihanModel squatsTrain = new LatihanModel();
        squatsTrain.setNama("Squats");
        squatsTrain.setDeskripsi("Stand tall with your feet at hip-width distance apart, shoulders relaxed. Look ahead to keep your neck aligned with your spine, and hold your arms straight in front of you or on your hips.");
        squatsTrain.setGambar("https://experiencelife.com/wp-content/uploads/2017/03/Squat-1280x720.jpg");
        allTrainings.add(squatsTrain);

        LatihanModel plankTrain = new LatihanModel();
        plankTrain.setNama("Plank");
        plankTrain.setDeskripsi("Keep your body a straight line from the top of your head to the tips of your heels. Cup your wrists together if they hurt from the pressure.");
        plankTrain.setGambar("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/hdm119918mh15842-1545237096.png");
        allTrainings.add(plankTrain);

        LatihanModel pushupTrain = new LatihanModel();
        pushupTrain.setNama("Push-up");
        pushupTrain.setDeskripsi("A push-up (or press-up if the hands are wider than shoulders placing more emphasis on the pectoral muscles[citation needed]) is a common calisthenics exercise beginning from the prone position");
        pushupTrain.setGambar("https://miro.medium.com/proxy/1*fofv1IipvCgYDFA3WwZS9g.jpeg");
        allTrainings.add(pushupTrain);
    }

    public static ArrayList<LatihanModel> getAllTrainings() {
        return allTrainings;
    }

    public static void setAllTrainings(ArrayList<LatihanModel> allTrainings) {
        Utils.allTrainings = allTrainings;
    }

    public static ArrayList<JadwalModel> getUsersPlan() {
        return usersPlan;
    }

    public static void setUsersPlan(ArrayList<JadwalModel> usersPlan) {
        Utils.usersPlan = usersPlan;
    }

    public static boolean addUsersPlan(JadwalModel plan){
        return usersPlan.add(plan);
    }

    public static boolean removeUsersPlan(JadwalModel plan){
        return usersPlan.remove(plan);
    }


}

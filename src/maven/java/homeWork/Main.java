package homeWork;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DaySchedule mySchedule = new DaySchedule(Day.MONDAY);
        List<String> act = mySchedule.getActivities();
        act.add("hackerman");
        System.out.println(mySchedule.getActivities());
        System.out.println(act);
        mySchedule.addActivty("running");
        System.out.println(mySchedule.getActivities());

        DailyPlanner planner = new DailyPlanner();
        planner.addActivity(Day.THURSDAY, "inot");
        planner.addActivity(Day.THURSDAY, "chitara");
        System.out.println(planner.getDaySchedule(Day.THURSDAY));
        planner.removeActivity(Day.THURSDAY, "inot");
        System.out.println(planner.getDaySchedule(Day.THURSDAY));
//		planer.removeActivity(Day.THURSDAY, "crosetat");
        System.out.println(planner.getDaySchedule(Day.THURSDAY));
        try {
            System.out.println(planner.endPlanning());
        } catch (NoActivityForDayException er) {
            System.err.println(er.getMessage());
        }
    }
}

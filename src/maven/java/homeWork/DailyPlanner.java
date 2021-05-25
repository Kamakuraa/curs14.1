package homeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    private final List<DaySchedule> daySchedules = new ArrayList<>();


    public void addActivity(Day day, String activity) {
        if (activity == null) {
            throw new NoActivityException("activity is null");
        }
        var foundSchedule = getDaySchedule(day);
    }

    public DaySchedule getDaySchedule(Day day) {
        for (DaySchedule schedule : daySchedules) {
            if (schedule.getDay() == day) {
                return schedule;
            }
        }
        return null;
    }

    public void removeActivity(Day day, String activity) {
        DaySchedule daySchedule = getDaySchedule(day);
        if (daySchedule == null || !daySchedule.containsActivity(activity)) {
            throw new NoActivityException("Day " + day + " doesn't have activity");
        } else {
            daySchedule.removeActivity(activity);
        }

    }

    public List<String> getActivities(Day day) {
        DaySchedule schedule = getDaySchedule(day);
        if (schedule != null) {
            return schedule.getActivities();
        } else {
            return List.of();
        }
    }

    public Map<Day, List<String>> endPlanning() throws NoActivityForDayException {
        Map<Day, List<String>> result = new HashMap<>();
        for (Day day : Day.values()) {
            DaySchedule schedule = getDaySchedule(day);
            {
                if (schedule == null || schedule.getActivities().isEmpty()){
                    throw new NoActivityForDayException("no activities for " + day);
                }
                result.put(schedule.getDay(), schedule.getActivities());
            }
        }
        return result;
    }
}

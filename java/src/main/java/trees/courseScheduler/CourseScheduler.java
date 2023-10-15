package trees.courseScheduler;

import java.util.ArrayList;
import java.util.List;

public class CourseScheduler {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || prerequisites == null || prerequisites.length == 0) return true;

        //Create an array list of list of integers to keep track of courses
        List<List<Integer>> courses = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            courses.add(new ArrayList<>());
        }

        //create a dependency graph
        for(int i = 0; i < prerequisites.length; i++){
            courses.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int[] visited = new int[numCourses];

        //dfs visit each course
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, courses, visited)) return false;
        }
        return true;
    }

    private boolean dfs(int course, List<List<Integer>> courses, int[] visited) {
        //marke the course as being visited
        visited[course] = 1;

        //get its children
        List<Integer> eligibleCourses = courses.get(course);

        //dfs its children
        for (int i = 0; i < eligibleCourses.size(); i++) {
            int eligibleCourse = eligibleCourses.get(i);
            //has been visited while visiting its children - cycle exits !!
            if (visited[eligibleCourse] == 1) return false;

            //not visited
            if (visited[eligibleCourse] == 0) {
                if (!dfs(eligibleCourse, courses, visited)) return false;
            }
        }
        //done visiting flag change
        visited[course] = 2;
        return true;
    }

    public static void main(String[] args) {
        CourseScheduler cs = new CourseScheduler();
        int courseLimit = 2;
        int[][] courses1 = {{0,1}};
        int[][] courses2 = {{1,0},{0,1}};

        cs.canFinish(courseLimit,courses2);
    }
}

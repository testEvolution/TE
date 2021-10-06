private TaskSeriesCollection createCollection1() {
        TaskSeriesCollection result = new TaskSeriesCollection();
        TaskSeries s1 = new TaskSeries("S1");
        s1.add(new Task("Task 1", new Date(1), new Date(2)));
        s1.add(new Task("Task 2", new Date(3), new Date(4)));
        result.add(s1);
        TaskSeries s2 = new TaskSeries("S2");
        s2.add(new Task("Task 3", new Date(5), new Date(6)));
        result.add(s2);
        return result;
    }

    
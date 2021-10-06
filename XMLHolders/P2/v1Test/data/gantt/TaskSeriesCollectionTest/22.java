@Test
    public void test697153() {

        TaskSeries s1 = new TaskSeries("S1");
        s1.add(new Task("Task 1", new SimpleTimePeriod(new Date(),
                new Date())));
        s1.add(new Task("Task 2", new SimpleTimePeriod(new Date(),
                new Date())));
        s1.add(new Task("Task 3", new SimpleTimePeriod(new Date(),
                new Date())));

        TaskSeries s2 = new TaskSeries("S2");
        s2.add(new Task("Task 2", new SimpleTimePeriod(new Date(),
                new Date())));
        s2.add(new Task("Task 3", new SimpleTimePeriod(new Date(),
                new Date())));
        s2.add(new Task("Task 4", new SimpleTimePeriod(new Date(),
                new Date())));

        TaskSeriesCollection tsc = new TaskSeriesCollection();
        tsc.add(s1);
        tsc.add(s2);

        s1.removeAll();

        int taskCount = tsc.getColumnCount();

        assertEquals(3, taskCount);

    }

    
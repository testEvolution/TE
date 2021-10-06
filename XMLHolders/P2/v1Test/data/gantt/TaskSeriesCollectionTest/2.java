private TaskSeriesCollection createCollection3() {

        // define subtasks
        Task sub1 = new Task("Sub1", new Date(11), new Date(111));
        Task sub2 = new Task("Sub2", new Date(22), new Date(222));
        Task sub3 = new Task("Sub3", new Date(33), new Date(333));
        Task sub4 = new Task("Sub4", new Date(44), new Date(444));
        Task sub5 = new Task("Sub5", new Date(55), new Date(555));
        Task sub6 = new Task("Sub6", new Date(66), new Date(666));
        sub1.setPercentComplete(0.111);
        sub2.setPercentComplete(0.222);
        sub3.setPercentComplete(0.333);
        sub4.setPercentComplete(0.444);
        sub5.setPercentComplete(0.555);
        sub6.setPercentComplete(0.666);

        TaskSeries seriesA = new TaskSeries("Series A");
        Task taskA1 = new Task("Task 1", new SimpleTimePeriod(new Date(100),
                new Date(200)));
        taskA1.setPercentComplete(0.1);
        taskA1.addSubtask(sub1);
        Task taskA2 = new Task("Task 2", new SimpleTimePeriod(new Date(220),
                new Date(350)));
        taskA2.setPercentComplete(0.2);
        taskA2.addSubtask(sub2);
        taskA2.addSubtask(sub3);
        seriesA.add(taskA1);
        seriesA.add(taskA2);

        TaskSeries seriesB = new TaskSeries("Series B");
        // note that we don't define taskB1
        Task taskB2 = new Task("Task 2", new SimpleTimePeriod(new Date(2220),
                new Date(3350)));
        taskB2.setPercentComplete(0.3);
        taskB2.addSubtask(sub4);
        taskB2.addSubtask(sub5);
        taskB2.addSubtask(sub6);
        seriesB.add(taskB2);

        TaskSeriesCollection tsc = new TaskSeriesCollection();
        tsc.add(seriesA);
        tsc.add(seriesB);

        return tsc;
    }

    
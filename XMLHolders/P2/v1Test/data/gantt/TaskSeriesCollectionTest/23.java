@Test
    public void test800324() {
        TaskSeries s1 = new TaskSeries("S1");
        s1.add(new Task("Task 1", new SimpleTimePeriod(new Date(),
                new Date())));
        s1.add(new Task("Task 2", new SimpleTimePeriod(new Date(),
                new Date())));
        s1.add(new Task("Task 3", new SimpleTimePeriod(new Date(),
                new Date())));

        TaskSeriesCollection tsc = new TaskSeriesCollection();
        tsc.add(s1);

        // these methods should throw an IndexOutOfBoundsException since the
        // column is too high...
        try {
            /* Number start = */ tsc.getStartValue(0, 3);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
            // expected
        }
        try {
            /* Number end = */ tsc.getEndValue(0, 3);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
            // expected
        }
        try {
            /* int count = */ tsc.getSubIntervalCount(0, 3);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    
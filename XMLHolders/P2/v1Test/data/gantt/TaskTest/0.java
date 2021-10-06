@Test
    public void testEquals() {
        Task t1 = new Task("T", new Date(1), new Date(2));
        Task t2 = new Task("T", new Date(1), new Date(2));
        assertTrue(t1.equals(t2));
        assertTrue(t2.equals(t1));

        t1.setDescription("X");
        assertFalse(t1.equals(t2));
        t2.setDescription("X");
        assertTrue(t1.equals(t2));

        t1.setDuration(new SimpleTimePeriod(new Date(2), new Date(3)));
        assertFalse(t1.equals(t2));
        t2.setDuration(new SimpleTimePeriod(new Date(2), new Date(3)));
        assertTrue(t1.equals(t2));

        t1.setPercentComplete(0.5);
        assertFalse(t1.equals(t2));
        t2.setPercentComplete(0.5);
        assertTrue(t1.equals(t2));

        t1.addSubtask(new Task("T", new Date(22), new Date(33)));
        assertFalse(t1.equals(t2));
        t2.addSubtask(new Task("T", new Date(22), new Date(33)));
        assertTrue(t1.equals(t2));


    }

    
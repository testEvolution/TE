@Test
    public void testEquals() {
        TaskSeries s1 = new TaskSeries("S");
        s1.add(new Task("T1", new Date(1), new Date(2)));
        s1.add(new Task("T2", new Date(11), new Date(22)));
        TaskSeries s2 = new TaskSeries("S");
        s2.add(new Task("T1", new Date(1), new Date(2)));
        s2.add(new Task("T2", new Date(11), new Date(22)));
        assertTrue(s1.equals(s2));
        assertTrue(s2.equals(s1));

        s1.add(new Task("T3", new Date(22), new Date(33)));
        assertFalse(s1.equals(s2));
        s2.add(new Task("T3", new Date(22), new Date(33)));
        assertTrue(s1.equals(s2));
    }

    
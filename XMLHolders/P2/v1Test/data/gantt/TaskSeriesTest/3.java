@Test
    public void testGetTask() {
        TaskSeries s1 = new TaskSeries("S");
        s1.add(new Task("T1", new Date(1), new Date(2)));
        s1.add(new Task("T2", new Date(11), new Date(22)));
        Task t1 = s1.get("T1");
        assertTrue(t1.equals(new Task("T1", new Date(1), new Date(2))));
        Task t2 = s1.get("T2");
        assertTrue(t2.equals(new Task("T2", new Date(11), new Date(22))));
        Task t3 = s1.get("T3");
        assertTrue(t3 == null);
    }

}
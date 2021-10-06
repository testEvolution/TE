@Test
    public void testGetSubTaskCount() {
        Task t1 = new Task("T", new Date(100), new Date(200));
        assertEquals(0, t1.getSubtaskCount());
        t1.addSubtask(new Task("S1", new Date(100), new Date(110)));
        assertEquals(1, t1.getSubtaskCount());
        Task s2 = new Task("S2", new Date(111), new Date(120));
        t1.addSubtask(s2);
        assertEquals(2, t1.getSubtaskCount());
        t1.addSubtask(new Task("S3", new Date(121), new Date(130)));
        assertEquals(3, t1.getSubtaskCount());
        t1.removeSubtask(s2);
        assertEquals(2, t1.getSubtaskCount());
    }

}
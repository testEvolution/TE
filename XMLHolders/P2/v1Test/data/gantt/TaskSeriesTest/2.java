@Test
    public void testSerialization() {
        TaskSeries s1 = new TaskSeries("S");
        s1.add(new Task("T1", new Date(1), new Date(2)));
        s1.add(new Task("T2", new Date(11), new Date(22)));
        TaskSeries s2 = (TaskSeries) TestUtils.serialised(s1);
        assertEquals(s1, s2);
    }

    
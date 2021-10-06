@Test
    public void testSerialization() {
        Task t1 = new Task("T", new Date(1), new Date(2));
        Task t2 = (Task) TestUtils.serialised(t1);
        assertEquals(t1, t2);
    }

    
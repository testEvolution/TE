@Test
    public void testCloning() throws CloneNotSupportedException {
        Task t1 = new Task("T", new Date(1), new Date(2));
        Task t2 = (Task) t1.clone();
        assertTrue(t1 != t2);
        assertTrue(t1.getClass() == t2.getClass());
        assertTrue(t1.equals(t2));
    }

    
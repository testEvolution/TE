@Test
    public void testCloning() throws CloneNotSupportedException {
        LogAxis a1 = new LogAxis("Test");
        LogAxis a2 = (LogAxis) a1.clone();
        assertTrue(a1 != a2);
        assertTrue(a1.getClass() == a2.getClass());
        assertTrue(a1.equals(a2));
    }

    
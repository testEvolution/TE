@Test
    public void testCloning() {
        LogFormat f1 = new LogFormat(10.0, "10", true);
        LogFormat f2 = (LogFormat) f1.clone();
        assertTrue(f1 != f2);
        assertTrue(f1.getClass() == f2.getClass());
        assertTrue(f1.equals(f2));
    }

    
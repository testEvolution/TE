@Test
    public void testCloning() throws CloneNotSupportedException {
        ValueAxis a1 = new NumberAxis("Test");
        ValueAxis a2 = (NumberAxis) a1.clone();
        assertTrue(a1 != a2);
        assertTrue(a1.getClass() == a2.getClass());
        assertTrue(a1.equals(a2));
    }

    
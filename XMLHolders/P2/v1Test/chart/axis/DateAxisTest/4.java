@Test
    public void testCloning() throws CloneNotSupportedException {
        DateAxis a1 = new DateAxis("Test");
        DateAxis a2 = (DateAxis) a1.clone();
        assertTrue(a1 != a2);
        assertTrue(a1.getClass() == a2.getClass());
        assertTrue(a1.equals(a2));
    }

    
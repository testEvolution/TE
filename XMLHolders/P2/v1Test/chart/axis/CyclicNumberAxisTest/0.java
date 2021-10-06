@Test
    public void testCloning() throws CloneNotSupportedException {
        CyclicNumberAxis a1 = new CyclicNumberAxis(10, 0, "Test");
        CyclicNumberAxis a2 = (CyclicNumberAxis) a1.clone();
        assertTrue(a1 != a2);
        assertTrue(a1.getClass() == a2.getClass());
        assertTrue(a1.equals(a2));
    }

    
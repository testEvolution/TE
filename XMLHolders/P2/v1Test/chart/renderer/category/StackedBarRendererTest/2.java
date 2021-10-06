@Test
    public void testCloning() throws CloneNotSupportedException {
        StackedBarRenderer r1 = new StackedBarRenderer();
        StackedBarRenderer r2 = (StackedBarRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    
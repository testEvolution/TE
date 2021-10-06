@Test
    public void testCloning() throws CloneNotSupportedException {
        GroupedStackedBarRenderer r1 = new GroupedStackedBarRenderer();
        GroupedStackedBarRenderer r2 = (GroupedStackedBarRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    
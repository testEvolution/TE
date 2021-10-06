@Test
    public void testCloning() throws CloneNotSupportedException {
        GanttRenderer r1 = new GanttRenderer();
        GanttRenderer r2 = (GanttRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    
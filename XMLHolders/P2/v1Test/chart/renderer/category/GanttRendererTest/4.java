@Test
    public void testSerialization() {
        GanttRenderer r1 = new GanttRenderer();
        r1.setCompletePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f,
                4.0f, Color.BLUE));
        r1.setIncompletePaint(new GradientPaint(4.0f, 3.0f, Color.RED, 2.0f,
                1.0f, Color.BLUE));
        GanttRenderer r2 = (GanttRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

}
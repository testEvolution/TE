@Test
    public void testSerialization() {
        CategoryAxis a1 = new CategoryAxis("Test Axis");
        a1.setTickLabelPaint("C1", new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.WHITE));
        CategoryAxis a2 = (CategoryAxis) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

}
@Test
    public void test1808376() {
        Stroke stroke = new BasicStroke(1.0f);
        Stroke outlineStroke = new BasicStroke(2.0f);
        ValueMarker m = new ValueMarker(1.0, Color.RED, stroke, Color.BLUE,
                outlineStroke, 0.5f);
        assertEquals(1.0, m.getValue(), EPSILON);
        assertEquals(Color.RED, m.getPaint());
        assertEquals(stroke, m.getStroke());
        assertEquals(Color.BLUE, m.getOutlinePaint());
        assertEquals(outlineStroke, m.getOutlineStroke());
        assertEquals(0.5f, m.getAlpha(), EPSILON);
    }

}
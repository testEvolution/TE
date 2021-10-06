@Test
    public void testSerialization() {
        Stroke s = new BasicStroke(1.23f);
        LegendGraphic g1 = new LegendGraphic(new Rectangle2D.Double(1.0, 2.0, 
                3.0, 4.0), Color.BLACK);
        g1.setOutlineStroke(s);
        LegendGraphic g2 = (LegendGraphic) TestUtils.serialised(g1);
        assertTrue(g1.equals(g2));
    }

}
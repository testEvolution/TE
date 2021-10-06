@Test
    public void testSerialization2() {
        StrokeMap m1 = new StrokeMap();
        m1.put("K1", new BasicStroke(1.1f));
        m1.put("K2", new BasicStroke(2.2f));
        StrokeMap m2 = (StrokeMap) TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }

}
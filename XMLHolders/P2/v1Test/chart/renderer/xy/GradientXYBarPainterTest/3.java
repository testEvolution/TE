@Test
    public void testSerialization() {
        GradientXYBarPainter p1 = new GradientXYBarPainter(0.1, 0.2, 0.3);
        GradientXYBarPainter p2 = (GradientXYBarPainter) 
                TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

}
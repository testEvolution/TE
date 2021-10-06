@Test
    public void testSerialization() {
        // test a default instance
        DialCap c1 = new DialCap();
        DialCap c2 = (DialCap) TestUtils.serialised(c1);
        assertEquals(c1, c2);

        // test a custom instance
        c1 = new DialCap();
        c1.setFillPaint(new GradientPaint(1.0f, 2.0f, Color.BLUE,
                3.0f, 4.0f, Color.GREEN));
        c1.setOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.WHITE,
                3.0f, 4.0f, Color.GRAY));
        c1.setOutlineStroke(new BasicStroke(2.0f));

        c2 = (DialCap) TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

}
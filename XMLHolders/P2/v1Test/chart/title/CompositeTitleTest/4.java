@Test
    public void testSerialization() {
        CompositeTitle t1 = new CompositeTitle(new BlockContainer());
        t1.getContainer().add(new TextTitle("T1"));
        t1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED,
                3.0f, 4.0f, Color.BLUE));
        CompositeTitle t2 = (CompositeTitle) TestUtils.serialised(t1);
        assertEquals(t1, t2);
    }

}
@Test
    public void testSerialization() {
        XYBubbleRenderer r1 = new XYBubbleRenderer();
        XYBubbleRenderer r2 = (XYBubbleRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
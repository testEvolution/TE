@Test
    public void testSerialization2() {
        XYBarRenderer r1 = new XYBarRenderer();
        r1.setPositiveItemLabelPositionFallback(new ItemLabelPosition());
        XYBarRenderer r2 = (XYBarRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
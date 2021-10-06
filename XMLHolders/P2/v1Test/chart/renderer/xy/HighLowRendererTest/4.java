@Test
    public void testSerialization() {
        HighLowRenderer r1 = new HighLowRenderer();
        r1.setCloseTickPaint(Color.GREEN);
        HighLowRenderer r2 = (HighLowRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
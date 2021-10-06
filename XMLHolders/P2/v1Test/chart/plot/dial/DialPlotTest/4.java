@Test
    public void testSerialization() {
        DialPlot p1 = new DialPlot();
        DialPlot p2 = (DialPlot) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

    
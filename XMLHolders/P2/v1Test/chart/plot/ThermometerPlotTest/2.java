@Test
    public void testSerialization() {
        ThermometerPlot p1 = new ThermometerPlot();
        ThermometerPlot p2 = (ThermometerPlot) TestUtils.serialised(p1);
        assertTrue(p1.equals(p2));
    }

    
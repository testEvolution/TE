@Test
    public void testSerialization() {
        XYStepRenderer r1 = new XYStepRenderer();
        r1.setStepPoint(0.123);
        XYStepRenderer r2 = (XYStepRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
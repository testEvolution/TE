@Test
    public void testSerialization() {
        XYStepAreaRenderer r1 = new XYStepAreaRenderer();
        XYStepAreaRenderer r2 = (XYStepAreaRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
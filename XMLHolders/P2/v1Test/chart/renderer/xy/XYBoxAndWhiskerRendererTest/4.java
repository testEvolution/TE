@Test
    public void testSerialization() {
        XYBoxAndWhiskerRenderer r1 = new XYBoxAndWhiskerRenderer();
        XYBoxAndWhiskerRenderer r2 = (XYBoxAndWhiskerRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
@Test
    public void testSerialization() {
        XYLineAndShapeRenderer r1 = new XYLineAndShapeRenderer();
        XYLineAndShapeRenderer r2 = (XYLineAndShapeRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
@Test
    public void testSerialization() {
        StatisticalLineAndShapeRenderer r1
                = new StatisticalLineAndShapeRenderer();
        StatisticalLineAndShapeRenderer r2 = (StatisticalLineAndShapeRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
@Test
    public void testSerialization() {
        XYShapeRenderer r1 = new XYShapeRenderer();
        XYShapeRenderer r2 = (XYShapeRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
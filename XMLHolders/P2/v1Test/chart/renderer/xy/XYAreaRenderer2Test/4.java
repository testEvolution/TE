@Test
    public void testSerialization() {
        XYAreaRenderer2 r1 = new XYAreaRenderer2();
        XYAreaRenderer2 r2 = (XYAreaRenderer2) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
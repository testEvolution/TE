@Test
    public void testSerialization1() {
        PaintMap m1 = new PaintMap();
        PaintMap m2 = (PaintMap) TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }

    
@Test
    public void testSerialization() {
        LineFunction2D f1 = new LineFunction2D(1.0, 2.0);
        LineFunction2D f2 = (LineFunction2D) TestUtils.serialised(f1);
        assertEquals(f1, f2);
    }

    
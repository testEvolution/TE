@Test
    public void testSerialization() {
        PiePlot3D p1 = new PiePlot3D(null);
        PiePlot3D p2 = (PiePlot3D) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

    
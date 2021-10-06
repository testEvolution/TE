@Test
    public void testSerialization() {
        StackedXYAreaRenderer r1 = new StackedXYAreaRenderer();
        r1.setShapePaint(Color.RED);
        r1.setShapeStroke(new BasicStroke(1.23f));
        StackedXYAreaRenderer r2 = (StackedXYAreaRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
@Test
    public void testSerialization() {
        StackedXYAreaRenderer2 r1 = new StackedXYAreaRenderer2();
        StackedXYAreaRenderer2 r2 = (StackedXYAreaRenderer2) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
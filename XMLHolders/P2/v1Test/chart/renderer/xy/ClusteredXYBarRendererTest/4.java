@Test
    public void testSerialization() {
        ClusteredXYBarRenderer r1 = new ClusteredXYBarRenderer();
        ClusteredXYBarRenderer r2 = (ClusteredXYBarRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    
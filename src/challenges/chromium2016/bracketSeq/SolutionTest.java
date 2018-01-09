package challenges.chromium2016.bracketSeq;

import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(HierarchicalContextRunner.class)
public class SolutionTest {

	private Solution solution;

	@Before
	public void setUp() {
		solution = new Solution();
	}


	public class BracketSequenceValidation {

		@Test
		public void emptyString_isSeq() {
			assertSeq("");
		}

		@Test
		public void singleBracket_isNotSeq() {
			assertNotSeq("(");
			assertNotSeq(")");
		}

		@Test
		public void doubleBrackets() {
		    assertSeq("()");
		    assertNotSeq(")(");
		    assertNotSeq("((");
		    assertNotSeq("))");
		}

		@Test
		public void BracketSequenceValidation() {
		    assertSeq("((()()))");
		    assertSeq("(((())))");
		    assertSeq("(())(())");
		    assertNotSeq("((())(())");
		}


		private void assertNotSeq(String s) {
			assertFalse(solution.isBracketSeq(s));
		}

		private void assertSeq(String s) {
			assertTrue(solution.isBracketSeq(s));
		}
	}
}

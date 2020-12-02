package tbs.datasets;

public class RecruitmentScores {
	public static final int[] SCORES = new int[] {
			36,13,23,66,33,29,28,62,60,49,63,58,52,52,29,37,31,22,64,25,
			15,27,51,39,30,29,51,58,21,61,64,51,47,41,36,53,60,35,25,52,
			19,38,21,41,22,45,59,62,33,43,33,31,26,58,68,55,63,49,46,35,
			15,35,33,16,62,59,54,23,35,71,18,24,34,56,68,42,40,59,71,41,
			46,59,21,73,62,70,35,55,38,28,62,38,30,68,41,50,63,65,31,24,
			42,33,32,71,34,31,41,45,28,34,14,22,37,23,47,41,72,36,36,59,
			41,32,23,24,27,26,48,61,45,56,52,55,60,71,44,61,29,26,25,54,
			49,70,31,70,66,66,61,51,43,39,48,37,17,27,58,43,54,28,45,49,
			27,41,63,62,52,36,58,67,39,50,49,30,73,25,44,49,34,41,55,51,
			62,69,66,59,48,59,34,18,61,30,35,41,47,39,59,37,23,59,68,56,
			62,29,35,64,65,36,18,17,48,30,32,24,70,67,26,69,43,26,49,34,
			66,48,41,58,39,38,77,32,20,31,36,23,46,43,70,64,67,46,60,49,
			24,40,39,54,64,22,19,27,20,29,15,34,62,58,54,28,44,33,37,24,
			22,22,29,71,63,26,57,59,63,43,55,26,36,25,39,44,70,43,36,44,
			54,62,49,52,25,29,73,33,46,56,67,40,52,41,55,31,59,47,20,51,
			43,20,50,61,56,45,69,39,29,43,74,67,45,39,70,26,53,41,28,55,
			70,51,56,45,58,35,52,73,38,47,59,47,50,59,67,43,46,22,59,32,
			50,52,35,65,74,27,34,40,21,67,57,32,68,28,31,61,39,45,27,68,
			29,37,25,36,67,42,37,36,60,33,49,44,67,39,68,53,45,56,51,38,
			16,61,66,24,50,74,68,54,41,35,26,67,54,41,65,71,39,33,19,63,
			35,60,66,17,31,30,25,70,70,33,69,49,50,46,47,49,43,50,54,22,
			63,65,20,50,52,41,65,65,63,38,79,62,45,18,22,64,35,34,23,44,
			25,70,53,50,58,29,56,63,30,62,46,40,32,45,39,25,28,25,32,69,
			21,65,65,48,71,67,37,45,65,38,27,64,57,65,44,73,61,34,28,39,
			44,32,38,30,42,50,42,46,45,18,36,47,50,31,54,61,73,62,44,48,
			25,65,32,51,25,73,20,63,59,30,38,60,31,52,34,31,48,47,74,40,
			66,45,41,21,27,39,35,50,33,32,37,15,59,60,55,40,52,59,38,66,
			30,29,66,54,27,58,21,39,36,47,37,17,54,73,39,39,68,46,46,70,
			42,45,28,28,44,38,42,25,51,32,63,45,53,67,57,19,25,26,46,60,
			36,35,27,36,27,72,26,61,60,33,51,29,45,45,30,39,42,41,51,41,
			61,21,63,22,66,26,53,77,50,27,65,66,43,21,47,58,63,64,61,47,
			56,33,54,20,64,47,68,34,36,53,69,52,47,66,34,35,70,44,51,51,
			45,35,62,74,57,24,32,44,42,26,44,28,63,38,26,58,67,62,47,68,
			34,68,33,29,39,48,42,64,41,43,39,49,32,61,38,53,62,19,47,21,
			32,50,36,41,49,70,54,59,45,73,55,47,40,37,49,59,62,28,12,26,
			70,65,48,44,40,31,50,22,54,68,48,49,41,38,36,37,25,62,57,48,
			45,36,55,63,27,49,63,61,65,27,38,41,68,28,47,47,60,28,51,27,
			20,39,45,24,34,31,49,66,58,43,20,68,42,32,41,42,67,68,29,42,
			44,48,32,39,46,59,28,72,55,65,44,41,33,40,25,49,48,55,37,51,
			14,28,30,60,53,26,58,49,39,22,38,72,53,49,44,65,26,21,55,72,
			36,50,34,44,34,67,40,24,71,46,27,74,22,27,32,32,58,54,49,23,
			20,32,41,49,32,46,35,60,32,46,52,68,35,74,57,24,48,36,21,20,
			57,37,51,57,33,62,48,34,60,22,26,34,66,38,63,31,57,32,53,32,
			43,47,45,72,19,69,28,32,49,60,41,40,48,62,60,69,18,61,20,28,
			28,48,42,56,66,43,19,61,24,71,44,41,43,29,49,49,39,57,24,61,
			43,26,44,21,46,69,38,27,38,24,40,26,48,57,79,55,34,50,61,45,
			49,32,38,62,25,39,49,34,30,60,61,29,58,42,44,64,58,65,62,30,
			72,24,53,57,42,69,62,67,37,57,29,44,19,62,21,54,64,31,46,33,
			26,35,52,19,22,63,18,36,41,49,53,65,56,47,48,44,45,71,49,50,
			41,28,64,45,39,26,49,22,54,30,61,68,60,27,33,62,24,39,28,42,
			32,33,49,71,52,54,62,57,54,27,29,30,45,35,43,64,42,40,47,38,
			38,33,40,63,29,32,43,65,55,57,34,44,43,57,21,53,29,53,65,67,
			68,68,32,27,51,59,59,32,50,28,51,36,74,63,59,49,27,39,69,56,
			46,46,48,52,58,18,52,36,45,31,29,51,34,53,48,37,37,37,37,46,
			70,66,46,58,44,50,59,25,48,38,68,54,54,57,46,62,49,63,77,64,
			63,58,47,55,22,39,25,48,47,40,37,44,40,64,20,32,67,45,35,67,
			23,66,48,31,31,52,56,66,29,20,57,40,72,49,75,55,57,49,56,56,
			64,55,50,46,56,58,66,46,27,42,42,51,35,40,39,21,47,66,23,39,
			46,64,67,25,79,15,32,36,38,25,57,66,30,33,68,25,27,34,28,61,
			45,64,35,19,50,34,66,53,12,25,49,34,68,61,64,38,67,45,16,20,
			43,54,53,26,25,35,60,53,16,61,59,75,36,38,49,36,30,45,48,26,
			18,43,59,70,13,60,46,36,45,20,40,32,46,71,47,68,62,27,21,49,
			54,44,41,40,35,40,29,43,41,65,75,51,68,31,39,22,21,64,25,43,
			36,21,22,56,55,53,44,19,56,67,25,26,56,44,64,18,53,58,65,55,
			71,27,59,67,53,46,22,46,51,60,57,45,55,68,61,49,56,55,28,47,
			51,31,37,32,69,25,23,42,60,32,37,49,38,72,23,44,42,31,65,44,
			25,33,46,67,31,29,63,35,39,56,26,47,69,26,24,29,44,40,42,38,
			47,26,63,42,25,53,60,63,37,61,28,25,35,22,73,57,35,40,40,18,
			47,40,42,76,68,21,52,34,30,34,32,37,69,46,45,28,30,43,33,23,
			59,27,34,49,34,43,68,44,61,51,27,62,28,60,58,30,48,41,62,28,
			52,54,41,46,24,37,10,41,35,76,65,60,33,25,32,50,62,23,23,62,
			24,66,46,46,27,34,61,40,18,25,23,66,21,57,20,72,29,43,47,59,
			25,16,35,63,43,76,47,43,51,61,59,52,25,57,71,51,63,39,55,66,
			34,37,37,67,70,20,27,57,66,52,24,35,69,47,39,30,53,58,66,26,
			38,16,44,37,72,62,63,38,72,53,55,63,37,43,38,61,34,24,53,56,
			56,41,25,54,45,36,54,66,30,62,25,28,52,25,46,39,55,50,41,57,
			62,54,38,44,32,57,68,52,24,35,47,23,35,25,54,42,56,48,61,60,
			25,33,25,43,60,53,26,16,51,45,47,59,26,68,29,35,41,66,21,35,
			38,57,32,61,26,38,33,35,34,23,56,58,64,51,55,33,56,46,43,21,
			26,55,32,22,48,61,48,47,28,32,51,36,39,20,52,32,63,66,42,62,
			30,30,44,63,49,59,37,26,63,19,26,54,61,27,62,58,55,53,59,61,
			35,22,35,52,32,22,39,62,45,63,44,22,40,62,41,29,56,63,72,47,
			28,33,52,49,59,30,66,63,27,64,29,29,53,51,40,64,40,28,50,28,
			28,46,40,53,39,43,31,44,41,25,26,28,57,54,49,25,49,52,55,61,
			82,61,28,43,67,60,53,27,21,42,61,33,58,57,19,66,38,27,25,45,
			33,53,33,43,34,46,45,69,27,44,67,39,20,53,37,49,56,23,37,62,
			26,63,51,59,42,21,53,60,21,71,27,46,43,65,44,19,60,55,23,18,
			58,63,29,66,28,63,32,27,28,51,30,50,64,13,31,45,59,50,34,28,
			29,63,59,50,46,33,62,22,33,58,66,31,51,48,71,74,34,16,39,45,
			52,52,24,53,33,76,38,22,25,18,37,46,56,67,61,16,32,52,33,59,
			46,29,31,55,61,44,31,28,40,26,55,65,40,45,41,52,68,45,35,40,
			40,45,23,71,49,36,72,57,74,34,39,70,29,67,23,26,54,30,34,26,
			75,69,53,37,62,47,51,30,39,32,40,22,40,49,56,40,69,16,47,65,
			19,27,16,45,61,28,50,63,72,33,27,47,56,59,50,64,28,33,38,37,
			58,22,46,38,20,54,43,41,42,64,59,58,48,59,34,32,18,68,45,26,
			50,38,35,46,61,34,31,69,66,72,39,39,46,66,17,32,68,60,25,57,
			58,32,48,34,60,28,51,22,29,43,50,28,43,63,38,41,16,38,75,63,
			29,34,46,47,25,52,29,34,53,67,67,28,51,68,23,62,56,32,46,23,
			39,28,51,37,50,43,55,28,57,60,51,66,45,52,61,28,41,23,38,30,
			27,40,37,58,38,53,68,65,34,61,77,29,26,72,71,29,61,46,27,65,
	};
}
